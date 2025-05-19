(ns Lista-3.sequencia2)

(def x (read))
(def total (read))

(defn faixa [n r]
  (range n (+ n r)))

(defn sequencia [n]
  (let [resto (mod total x)]
    (if (> (last (faixa n x)) total) (println (clojure.string/join " " (faixa n resto)))
                                     (println (clojure.string/join " " (faixa n x))))
    ))

(defn main []
    (doall (map sequencia (range 1 (inc total) x))))

(main)
