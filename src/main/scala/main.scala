
object build extends App {
  import org.bytedeco.javacpp.tools._
  Builder.main(Array("org.somecpp.NativeLibrary"))
  Builder.main(Array("com.revol.IO"))
}

object run extends App {
  import org.somecpp._
  var nativeClass = new NativeLibrary.NativeClass
  nativeClass.set_property("Hello World!")
  println(nativeClass.property())
}

object socket extends App {
  import com.revol.IO._
  import org.bytedeco.javacpp._

  var socket = new Socket {
    override def onReceive(data: BytePointer, len: Int): Int = {
      println(s"callback by overriding !! ${len}")
      0
    }
  }
  
  socket.send(new BytePointer, 45)
}
