(ns Lista-3.pares)

(defn pares [x y]
  (range x y 2))

(defn main []
  (doall (map println (pares 2 101))))

(main)