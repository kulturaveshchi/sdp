import org.scalatest.FunSpec

/**
  * Tests for the counter class
  */

class CounterTest extends FunSpec {
  describe("Counter") {
    it("has an initial value") {
      val initial = 10
      val counter = new Counter(initial)
      assert(counter.count == initial)
    }

    it("can produce an incremented counter") {
      val initial = 10
      val counter = new Counter(initial).inc

      assert(counter.count == initial + 1)
    }

    it("can produce a decremented counter") {
      val initial = 10
      val counter = new Counter(initial).dec

      assert(counter.count == initial - 1)
    }

    it("is unchanged when an incremented counter is produced") {
      val initial = 10
      val counter = new Counter(initial)
      counter.inc

      assert(counter.count == initial)
    }

    it("is unchanged when a decremented counter is produced") {
      val initial = 10
      val counter = new Counter(initial)
      counter.dec

      assert(counter.count == initial)
    }
  }
}
