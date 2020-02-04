(ns assignments.conditions-test
  (:require [clojure.test :refer :all]
            [assignments.conditions :refer :all]))

(deftest safe-division
  (testing "non zero denominator"
    (is (= 2 (safe-divide 4 2))))
  (testing "zero denominator"
    (is (nil? (safe-divide 3 0)))))


(deftest informative-divide-test
  (testing "non zero denominator"
    (is (= 3 (informative-divide 12 4))))
  (testing "zero denominator"
    (is (= :infinite (informative-divide 5 0)))))

(deftest harishchandra-test
  (testing "truthy value"
    (is (= 5 (harishchandra 5))))
  (testing "false value"
    (is (nil? (harishchandra false)))))

(deftest yudishtira-test
  (testing "truthy value"
    (is (= 5 (yudishtira 5))))
  (testing "false value"
    (is (= :ashwathama (yudishtira false)))))

(deftest five-point-someone-test
  (testing "when x is 5"
    (is (=  :satan-bhagat (five-point-someone 5 7))))
  (testing "when y is 5"
    (is (= :chetan-bhagat (five-point-someone 1 5))))
  (testing "when x is greater then y"                   )
    (is (= :greece (five-point-someone 9 7)))
  (testing "when x is 5"
    (is (= :universe (five-point-someone 3 7)))))

(deftest zero-aliases-test
  (testing "when arg is 0"
    (is (= :zero (zero-aliases 0))))
  
  (testing "when arg is []"
    (is (= :empty (zero-aliases []))))

  (testing "when arg is #{}"
    (is (= :empty-set (zero-aliases #{}))))

  (testing "when arg is {}"
    (is (= :empty-map (zero-aliases {}))))

  (testing "when arg is """
    (is (= :empty-string (zero-aliases ""))))
  (testing "when arg is non zero value"
    (is (= :not-zero (zero-aliases 7))))
  )

(deftest duplicate-first-test
  (testing "when list is empty"
    (is (nil? (duplicate-first []))))
  (testing "when collection is truthy"
    (is (= [1 1 2 3] (duplicate-first [1 2 3])))))

(deftest zero-separated-palindrome-test
  (testing "given a list create zero separated palindrome"
    (is (= [4 3 2 0 2 3 4] (zero-separated-palindrome [1 2 3])))))

(deftest order-in-words-test
  (testing "x>y>z"
      (is (= [:x-greater-than-y :y-greater-than-z] (order-in-words 4 3 2))))
    (testing "z>x>y"
      (is (= [:x-greater-than-y :z-greater-than-x] (order-in-words 4 3 5))))
    (testing "z>x"
      (is (= [:z-greater-than-x] (order-in-words 2 3 4)))))

(deftest repeat-and-truncate-test
  (testing "repeat the first n element"
    (is (= [1 2  3 4 1 2] (repeat-and-truncate [1 2 3 4] true true 6)))))


(deftest conditions-apply-test
  (testing "return ::wonder-woman if collection contains 1 and 3"
    (is (= :wonder-woman (conditions-apply [1 2 3 4 5])))))
