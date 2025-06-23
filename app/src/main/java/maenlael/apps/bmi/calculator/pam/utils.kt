package maenlael.apps.bmi.calculator.pam

fun Double.format(places: Int) = "%.${places}f".format(this)