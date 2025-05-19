(ns Lista-3.tabuada)

(def n (read))

(defn imprime [x]
  (println (str x " x " n " = " (((fn [x] (fn [n] (* x n))) x) n))))

(defn main []
  (doall  (map imprime (range 1 11))))

(main)