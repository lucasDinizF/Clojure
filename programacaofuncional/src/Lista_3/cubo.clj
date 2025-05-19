(ns Lista-3.cubo)

(defn quadrado_cubo [n]
  (println n ((fn [n] (* n n))n)  ((fn [n] (* n n n)) n)))

(defn main []
  (let [n (read)]
    (doall (map quadrado_cubo (range 1 (+ n 1))))))

(main)