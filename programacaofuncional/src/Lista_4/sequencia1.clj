(ns Lista-4.sequencia1)

(defn sequecia []
  (reduce + (map (fn [x] (/ 1.0 x)) (range 1 101))))

(defn main []
    (println (format "%.2f" (sequecia))))

(main)