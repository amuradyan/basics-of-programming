lazy val root = project
  .in(file("."))
  .settings(
    name := "vscode-dotty-worksheet",
    description := "A simple VS Code Dotty worksheet project.",
    version := "0.1.0",

    scalaVersion := "3.0.0-M3",

    useScala3doc := true,
  )
