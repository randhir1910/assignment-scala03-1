package edu.knoldus

import org.apache.log4j.Logger
import org.json4s.DefaultFormats
import org.json4s.native.Json

import scala.io.Source

class JSONRead {

  private final val logger = Logger.getLogger(this.getClass)

  implicit val format = DefaultFormats

  def readJson(): Unit = {

    val fileName = "/home/knoldus/Desktop/jsonfile.json"

    val persondata = Source.fromFile(fileName).getLines().mkString
    val personObject = Json.apply(format).read[Person](persondata)
    logger.info(s"$personObject")

  }
}
