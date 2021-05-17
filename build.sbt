lazy val root = project
  .in(file("."))
  .settings(
    name := "vscode-dotty-worksheet",
    description := "A simple VS Code Dotty worksheet project.",
    version := "0.1.0",

    scalaVersion := "2.13.4",

    useScala3doc := true,
  )
