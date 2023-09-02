package operator

class SumTerminateOperatorForBoolean : TerminateOperator<Number, Boolean> {
    override fun terminate(param: Sequence<Number>): Boolean {
        val sum = param.toList().sumBy { it.toInt() }
        return sum % 2 == 0
    }

}