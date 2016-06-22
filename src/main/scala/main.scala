
object build extends App {
  import org.bytedeco.javacpp.tools._
  Builder.main(Array("org.somecpp.NativeLibrary"))
}

object run extends App {
  import org.somecpp._
  var nativeClass = new NativeLibrary.NativeClass
  nativeClass.set_property("Hello World!")
  println(nativeClass.property())
}
