package app.prachang.composeui

data class Hotel(
    val hotelImage: String,
    val hotelName: String,
    val price: String,
    val ratings: String,
    val hotelAddress: String,
)

val hotels = listOf(
    Hotel(
        "https://cf.bstatic.com/xdata/images/hotel/square200/201118825.webp?k=16e19b9c0a2064f8bd98238b349b52ca72f4e7db722c1d055f2f244f277c3d6f&o=",
        "Kathmandu Eco Hotel",
        "NPR 2,956",
        "95%",
        "Thamel, Kathmandu"
    ),
    Hotel(
        "https://cf.bstatic.com/xdata/images/hotel/square200/173753181.webp?k=430efbf2d51d3e99ba918ada98b27dfd230aed7d26bd67980579ed192a43ec5a&o=",
        "Hotel Jhampa",
        "NPR 3,472",
        "97%",
        "Kapan, Kathmandu"
    ),
    Hotel(
        "https://cf.bstatic.com/xdata/images/hotel/square200/173753181.webp?k=430efbf2d51d3e99ba918ada98b27dfd230aed7d26bd67980579ed192a43ec5a&o=",
        "Hotel Shanker",
        "NPR 6,987",
        "94%",
        "Lazimpat, Kathmandu"
    ),
    Hotel(
        "https://cf.bstatic.com/xdata/images/hotel/square200/37849313.webp?k=edb5ca4db2818228d1bf6b77ce5c87409472b65181270eae3e99c3fff7111e84&o=",
        "Hotel Maridian Suite",
        "NPR 3,784",
        "98%",
        "Kathmandu"
    ),
    Hotel(
        "https://cf.bstatic.com/xdata/images/hotel/square200/96594338.webp?k=ae23e8a2c80b83a7aeae15a0c454440cc132c8a8f50c949fc5a839b6bec4f554&o=",
        "Kathmandu Guest House",
        "NPR 5,853",
        "91%",
        "Thamel Kathmandu"
    ),
    Hotel(
        "https://cf.bstatic.com/xdata/images/hotel/square200/201118825.webp?k=16e19b9c0a2064f8bd98238b349b52ca72f4e7db722c1d055f2f244f277c3d6f&o=",
        "Hotel Bauddha",
        "NPR 2,956",
        "95%",
        "Thamel, Kathmandu"
    ),
    Hotel(
        "https://cf.bstatic.com/xdata/images/hotel/square200/173753181.webp?k=430efbf2d51d3e99ba918ada98b27dfd230aed7d26bd67980579ed192a43ec5a&o=",
        "Jimbu Hotel",
        "NPR 3,472",
        "97%",
        "Kapan, Kathmandu"
    ),
    Hotel(
        "https://cf.bstatic.com/xdata/images/hotel/square200/173753181.webp?k=430efbf2d51d3e99ba918ada98b27dfd230aed7d26bd67980579ed192a43ec5a&o=",
        "Hyatt Hotel",
        "NPR 6,987",
        "94%",
        "Lazimpat, Kathmandu"
    ),
    Hotel(
        "https://cf.bstatic.com/xdata/images/hotel/square200/37849313.webp?k=edb5ca4db2818228d1bf6b77ce5c87409472b65181270eae3e99c3fff7111e84&o=",
        "Shiva Hotel",
        "NPR 3,784",
        "98%",
        "Kathmandu"
    ),
    Hotel(
        "https://cf.bstatic.com/xdata/images/hotel/square200/96594338.webp?k=ae23e8a2c80b83a7aeae15a0c454440cc132c8a8f50c949fc5a839b6bec4f554&o=",
        "Himalayan Guest House",
        "NPR 5,853",
        "91%",
        "Thamel Kathmandu"
    ),
)