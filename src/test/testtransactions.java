/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.*;
import model.DB;

/**
 *
 * @author Imal
 */
public class testtransactions {

    public static void main(String[] args) {
        try {
            for (int i = 0; i < 20; i++) {
                DB.getmyCon().createStatement().execute("CALL getInvoiceID(@Y)");
                ResultSet rsx = DB.getResultset("SELECT @Y AS id");
                rsx.first();
                String id = rsx.getString("id");
                System.out.println(id);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
