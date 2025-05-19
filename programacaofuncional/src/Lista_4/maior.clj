(ns Lista-4.maior)

(defn maximo [x]
  (reduce max x))

(defn posicao [x y]
  (inc (.indexOf x y)))

(defn main []
  (let [lista (repeatedly 100 read)
        max (maximo lista)]
    (println max)
    (println (posicao lista max))))

(main)