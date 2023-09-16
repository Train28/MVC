/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alexander
 */
public class DatosDB {

    public String Dvr;
    public String Url;
    public String Usr;
    public String Pass;
    public String Sql;

    public DatosDB() {

        this.Dvr = "com.mysql.cj.jdbc.Driver";
        this.Url = "jdbc:mysql://localhost:3306/control_clientes";
        this.Usr = "root";
        this.Pass = "123456";
        this.Sql = "SELECT * FROM clientes";

    }

}
