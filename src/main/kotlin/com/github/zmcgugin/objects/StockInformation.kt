package com.github.zmcgugin.objects

data class StockInformation (

    var ticker: String,
    var company: String,
    var sector: String,
    var industry: String,
    var country: String,
    var marketCap: Double,
    var pE: Double,
    var price: Double,
    var change: Double,
    var volume: Double,
    var last12MonthsFreeCashFlow: Double,
    var assets: Double,
    var liabilities:Double = 0.0,
    var sharesOutstanding: Double,
    var freeCashFlowIntrinsicValue: Double,
    var freeCashFlowIntrinsicMarginOfSafety: Double


) { constructor(): this("", "", "", "", "", 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0) }