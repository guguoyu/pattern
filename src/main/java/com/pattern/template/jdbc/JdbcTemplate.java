package com.pattern.template.jdbc;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values) {
        try {
            //1.获取连接
            Connection conn = this.getConnection();
            //2.创建语句集
            PreparedStatement pstm = this.createPrepareStatement(conn, sql);
            //3.执行语句集
            ResultSet rs = this.executeQuery(pstm, values);
            //4.处理结果集
            List<?> result = this.presResultSet(rs, rowMapper);
            //5.关闭结果集
            this.closeResultSet(rs);
            //6.关闭语句集
            this.closePstm(pstm);
            //7.关闭连接
            this.closeConn(conn);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void closeConn(Connection conn) throws SQLException {
        conn.close();
    }

    private void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    private void closePstm(PreparedStatement pstm) throws SQLException {
        pstm.close();
    }

    //处理结果集
    private List<?> presResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while (rs.next()) {
            result.add(rowMapper.mapRow(rs, rowNum++));
        }
        return result;
    }

    //执行语句集
    private ResultSet executeQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i, values[i]);
        }
        ResultSet resultSet = pstm.executeQuery();
        return resultSet;
    }

    private PreparedStatement createPrepareStatement(Connection conn, String sql) throws SQLException {
        PreparedStatement pstm = conn.prepareStatement(sql);
        return pstm;
    }

    private Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
