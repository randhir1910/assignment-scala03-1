package edu.knoldus

import java.io.PrintWriter

import com.google.gson.Gson
import org.apache.log4j.Logger

object Application extends App {

  val logger = Logger.getLogger(this.getClass)

  val person = new Person("randhir", "kumar", Constant.age, new Address("E73", "Noida", Constant.pinCode))

  val gson = new Gson
  val jsonObject = gson.toJson(person)

  val writer = new PrintWriter("/home/knoldus/Desktop/jsonfile.json")
  writer.print(jsonObject)
  writer.flush()
  writer.close()

  val reader = new JSONRead
  reader.readJson()

}
