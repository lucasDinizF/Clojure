(ns Lista-4.sequencia2)

(defn sequencia []
  (reduce + (map (fn [x y] (/ (double y) (Math/pow 2 (- x 1)))) (range 1 40) (range 1 39 2))))

(defn main []
    (println (format "%.2f" (sequencia))))

(main)