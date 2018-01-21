package edu.knoldus

import org.apache.log4j.Logger

import scala.io.Source

class JSONRead {

  private final val logger = Logger.getLogger(this.getClass)

  def readJson(): Unit = {

    val fileName = "/home/knoldus/Desktop/jsonfile.json"

    for (person <- Source.fromFile(fileName).getLines()) {

      logger.info(person)

    }
  }
}
