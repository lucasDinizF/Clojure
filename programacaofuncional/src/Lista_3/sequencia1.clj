(ns Lista-3.sequencia1)

(defn quadrado_cubo [n]
  (let [quadrado (* n n)
        cubo (* n n n)]
    (println n  quadrado  cubo)
    (println n (+ quadrado 1) (+ cubo 1))))

(defn main []
  (let [n (read)]
    (doall (map quadrado_cubo (range 1 (+ n 1))))))

(main)