package com.jmitwa.tuto.data.gen.util

import com.google.gson.Gson
import com.jmitwa.tuto.data.gen.entity._


import java.io._
import com.jmitwa.tuto.data.gen.java.util.JavaFileUtils

case class User1(id:String,name:String,country:String,state:String,areaPinCode:String,age:Int,sex:String)
object UserDataGenService {
  val gson:Gson = new Gson()
  
  def createFile()={
    val canonicalFilename = "/Users/sunil/workarea/dummy_ws/spark_basic/sample_data/user.json"
     val writer = JavaFileUtils.createBufferedWriter(canonicalFilename)
     
     createUser(writer)
     JavaFileUtils.close(writer);
  }
  
  def createUser(writer:BufferedWriter)={
    val country = "India"
    val state = "KRT"
    val areaPinCode="560"
    
    for(i<-1 to 1000)
    {
      val u = new User(i.toString(),"name"+i.toString(),country,state,areaPinCode+i,i,"M")
      val uJson = getUserJson(u)
      JavaFileUtils.writeLine(writer, uJson)
    }
  }
  
  def getUserJson(u:User):String = {
    val uJson = gson.toJson(u)
    uJson
  }
}