package singleton;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author mzwandile on 2020/04/04
 * @project design patterns
 */
@Slf4j
public class DbSingletonDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();

        long timeBefore = 0;
        long timeAfter = 0;

        log.debug("Getting initial connection");
        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        log.debug("Time taken to get connection is [{}] milliseconds", (timeAfter - timeBefore));

        Statement statement;

        try {
            statement = conn.createStatement();
            int count = statement
                    .executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR (256),"
                            + "City VARCHAR(256))");
            log.debug("Table created.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        log.debug("Getting another connection");
        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        log.debug("Time taken to get connection is [{}] milliseconds", (timeAfter - timeBefore));
    }
}
