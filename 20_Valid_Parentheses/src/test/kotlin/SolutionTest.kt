import io.kotlintest.shouldBe
import io.kotlintest.specs.FunSpec

class SolutionTest : FunSpec({
    val sol = Solution()
    test("basic test") {
        sol.isValid("()") shouldBe true
        sol.isValid("()[]{}") shouldBe true
        sol.isValid("(]") shouldBe false
        sol.isValid("([)]") shouldBe false
        sol.isValid("{[]}") shouldBe true
    }
    test("only close should be false") {
        sol.isValid(")") shouldBe false
        sol.isValid("]") shouldBe false
        sol.isValid("}") shouldBe false
    }
})
