package com.aswin.retrofitdemoapp.model

/** JSON SAMPLE - API: https://testapi.devtoolsdaily.com/companies
 * [
 *   {
 *     "name": "Walt Disney",
 *     "countryCode": "US",
 *     "market_cap": "168.7",
 *     "id": 49
 *   }
 * ]
 * **/
// If Our JSON response Starts with [],
// we need to create a wrapper class that extends 'ArrayList'
class CompaniesList: ArrayList<Company>() {
}