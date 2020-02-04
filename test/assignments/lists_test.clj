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
