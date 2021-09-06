package com.projecttesandroid.weatherapp.networking


object ApiEndpoint {
    var BASEURL = "http://api.openweathermap.org/data/2.5/"
    var CurrentWeather = "weather?"
    var ListWeather = "forecast?"
    var Daily = "forecast/daily?"
    var UnitsAppid = "&units=metric&appid=5a5ff6d93894bf6c37c11717c5e1b7c1"
    var UnitsAppidDaily = "&units=metric&cnt=15&appid=5a5ff6d93894bf6c37c11717c5e1b7c1"
}
