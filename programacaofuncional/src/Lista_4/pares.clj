(ns Lista-4.pares)

(defn pares [x]
  (count (filter even? x)))

(defn main []
  (println (pares (repeatedly 5 read)) "valores pares"))

(main)