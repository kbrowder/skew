package net.kbserve.web
import javax.servlet.http.HttpServlet
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import javax.servlet.ServletConfig
import com.sun.grizzly.comet.CometEngine

class Bayeux extends HttpServlet {
  val channel = "/chat/hi";
  

}