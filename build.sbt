name := "javacpp-sandbox"
organization := "org.sandbox.javacpp"
version := "0.0.0-SNAPSHOT"
scalaVersion := "2.11.8"

scalacOptions ++= Seq("-deprecation")

// Some dependencies like `javacpp` are packaged with maven-plugin packaging
classpathTypes += "maven-plugin"
libraryDependencies += "org.bytedeco" % "javacpp" % "1.2.1"

// About javacpp-repsets
// Platform classifier for native library dependencies
// val platform = org.bytedeco.javacpp.Loader.getPlatform
//
// // Libraries with native dependencies
// val bytedecoPresetLibs = Seq("opencv" -> "3.1.0-1.2").flatMap {
//   case (lib, ver) => Seq(
//     // Add both: dependency and its native binaries for the current `platform`
//     "org.bytedeco.javacpp-presets" % lib % ver,
//     "org.bytedeco.javacpp-presets" % lib % ver classifier platform
//   )
// }
// autoCompilerPlugins := true
//
// libraryDependencies += "org.bytedeco" % "javacv" % "1.2"

