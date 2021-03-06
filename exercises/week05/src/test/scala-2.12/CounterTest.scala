import org.scalatest.FunSpec

/**
  * Tests for the counter class
  */

class CounterTest extends FunSpec {
  describe("Counter") {
    it("has an initial value") {
      val initial = 10
      val counter = Counter(initial)
      assert(counter.count == initial)
    }

    it("can produce an incremented counter") {
      val initial = 10
      val counter = Counter(initial).inc()

      assert(counter.count == initial + 1)
    }

    it("can produce a decremented counter") {
      val initial = 10
      val counter = Counter(initial).dec()

      assert(counter.count == initial - 1)
    }

    it("is unchanged when an incremented counter is produced") {
      val initial = 10
      val counter = Counter(initial)
      counter.inc()

      assert(counter.count == initial)
    }

    it("is unchanged when a decremented counter is produced") {
      val initial = 10
      val counter = Counter(initial)
      counter.dec()

      assert(counter.count == initial)
    }

    it("can produce a counter incremented by more than 1") {
      val initial = 10
      val increment = 5
      val counter = Counter(initial).inc(increment)
      assert(counter.count == initial + increment)
    }

    it("can produce a counter decremented by more than 1") {
      val initial = 10
      val decrement = 5
      val counter = Counter(initial).dec(decrement)
      assert(counter.count == initial - decrement)
    }

    it("has a default count of 0") {
      assert(Counter().count == 0)
    }

    it("can be adjusted") {
      val initial = 10
      val increment = 5
      val counter = Counter(initial)
      val adder = new Adder(increment)
      assert(counter.adjust(adder).count == initial + increment)
    }
  }
}
