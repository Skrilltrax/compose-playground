package navigation

enum class Destination(title: String, relativePath: String) {
  AboutDestination("about", "/"),
  BlogDestination("blog", "/blog")
}
