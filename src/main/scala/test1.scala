import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException

class connection() {
  def connect() = {
    var conn: Connection = null

    try {
      val currentDir = System.getProperty("user.dir")
      val url = "jdbc:sqlite:" + currentDir + "/" + "recipebook.db"
      conn = DriverManager.getConnection(url)
      println("Connection established?")
      val sql = "CREATE TABLE TEST " + "(id INTEGER not NULL, " + "first VARCHAR(255), " + " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))"
      val sql = "CREATE TABLE TEST " + "(id INTEGER not NULL, " + "first VARCHAR(255), " + " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))"
      val stmt = conn.createStatement()
      stmt.executeUpdate(sql)
      println ("Table TEST created!")
    } catch {
      case e:SQLException => println(e)
      case _ => println("paska")
    } finally {
      try {
        if (conn != null) {
          println(conn)
          conn.close()
          println("Connection closed")
        }
      } catch {
        case f:SQLException => println(f)
        case _ => println("paska.")
      }
    }
  }
}

object test1 extends App{
  val test = new connection
  println("new connection done.")
  test.connect()
}
