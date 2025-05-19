(ns Lista-3.quadrado)


(defn imprime [n]
  (println (str n "^2 = " ((fn [x] (* x x)) n))))


(defn main []
  (let [n (read)]
    (doall  (map imprime (range 2 (+ n 1) 2)))))

(main)