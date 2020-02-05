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
