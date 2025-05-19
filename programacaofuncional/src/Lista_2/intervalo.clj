(ns Lista-2.intervalo)


(defn intervalo [n]
  (cond (and (>= n 0.0) (<= n 25.0)) "Intervalo [0,25]"
        (and (> n 25.0) (<= n 50.0)) "Intervalo (25,50]"
        (and (> n 50.0) (<= n 75.0)) "Intervalo (50,75]"
        (and (> n 75.0) (<= n 100.0)) "Intervalo (75,100]"
        :else "Fora de intervalo"))


(defn main []
  (let [n (read)]
    (println (intervalo n))))

(main)
