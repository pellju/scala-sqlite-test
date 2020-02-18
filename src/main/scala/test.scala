import slick.driver.SQLiteDriver.api._
import scala.concurrent.ExecutionContext.Implicits.global
import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
//import scalikejdbc._

object test extends App{
    val nameForDatabase = "recipebook"
    //val db = Database.forConfig()
    val driver = "jdbc:sqlite"
    val currentDir = System.getProperty("user.dir")
    //val url = "jdbc:sqlite:" + currentDir + "\\" + nameForDatabase + ".db"
    val url = nameForDatabase + ".db"
    var conn: Connection = null
    println("Hello, world!")
    println(conn)

    try {
        Class.forName(driver)
        conn = DriverManager.getConnection(url)
        //conn = Some(DriverManager.getConnection(url))
        println ("Connection established??")
    } catch {
        case e: SQLException => println(e)
    } finally {
        try {
            /*if (conn.get != None) {
                conn.get.close()
            }*/
            if (conn != null) conn.close()
        } catch {
            case f: SQLException => println(f)
        }
    }
}
