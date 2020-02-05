(ns assignments.lists-test
  (:require [clojure.test :refer :all]
            [assignments.lists :refer :all]))

(deftest lists
  (testing "map"
    (testing "identity with single coll"
      (is (= [1 2 3] (map' identity [1 2 3]))))))

(deftest map'-test
  (testing "inc in all element in given collection"
    (is (= [2 3 4] (map' inc [1 2 3])))))

(deftest filter'-test
  (testing "filter only even number in a given list"
    (is (= [2 4 8] (filter' even? [1 2 3 4 7 8])))))

(deftest reduce'-test
  (testing "add all number in a given list"
    (is (= 10 (reduce' + [1 2 3 4]))))
  (testing "add all number in a given list with initial value"
    (is (= 15 (reduce' + 5 [1 2 3 4])))))

(deftest count'-test
  (testing "it should return 0 for empty list"
    (is (= 0 (count' []))))
  (testing "it should return 4 for [1 2 3 4]"
    (is (= 4 (count' [1 2 3 4])))))


(deftest reverse'-test
  (testing "it should reverse the given list"
    (is (= [4 3 2 1] (reverse' [1 2 3 4])))))


(deftest every?'-test
  (testing "it should return true if every element of a list is true for pred"
    (is (= true (every?' even? [2 4 6 8]))))
  (testing "it should return false if any element of a list is false for pred"
    (is (= false (every?' even? [2 3 4 6 8])))))



(deftest some?'-test
  (testing "it should return true if any one element of a list is true for pred"
    (is (= true (some?' even? [1 5 4 6 9]))))
  (testing "it should return false if all element of a list is false for pred"
    (is (= false (some?' even? [1 5 7 9])))))

(deftest ascending?-test
  (testing "it should return true if every element is greater than or equal to its predecessor"
    (is (= true (ascending? [1 3 5 6 8 9]))))
  (testing "it should return false if every element is not greater than or equal to its predecessor"
    (is (= false (ascending? [1 5 4 6 7])))))

(deftest index-of-test
  (testing "give index of given element"
    (is (= 2 (index-of [1 2 4 5 6] 4))))
  (testing "give -1 if element is not present"
    (is (= -1 (index-of [1 2 4 5 6] 3)))))

(deftest sqr-of-the-first-test
  (testing "return sqr of first element of a give list"
    (is (= '(25 25 25 25) (sqr-of-the-first [5 3 4 7])))))

(deftest palindrome?-test
  (testing "return true if given collection is palindrome"
    (is (= true (palindrome? [1 2 3 3 2 1]))))
  (testing "return false if given collection is not a palindrome"
    (is (= false (palindrome? [1 2 5 6 4 2 1])))))

(deftest muted-thirds-test
  (testing "return a list that every third element is 0"
    (is (= [1 2 0 4 5 0] (muted-thirds [1 2 3 4 5 6])))))

(deftest third-or-fifth-test
  (testing "return only 3rd and 5th index element"
    (is (= [1 4 6 7] (third-or-fifth [1 2 3 4 5 6 7 8])))))

(deftest double-up-test
  (testing "return a list that contains every element twice"
    (is (= [1 1 2 2 3 3 4 4] (double-up [1 2 3 4])))))

(deftest sum-of-adjacent-digits-test
  (testing "add two adjacent digit in a given list"
    (is (= [3 5 7] (sum-of-adjacent-digits [1 2 3 4])))))

(deftest difference-test
  (testing "give difference between two list"
    (is (= `(4 6 5) (difference [1 2 3 9 8] [1 2 3 4 5 6 8])))))

(deftest union-test
  (testing "give union of two list"
    (is (= [1 2 3 4 5 5 6 7] (union [1 2 3 4] [1 2 3 4 5 5 6 7])))))

(deftest cross-product-test
  (testing "return cross product of two list"
    (is (= `([1 4] [1 3] [1 5] [2 4] [2 3] [2 5] [3 4]) (cross-product [1 2 3] [4 3 5])))))
