(ns Lista-2.multiplos)

(defn multiplos [x y]
  (if (or (zero? (mod x y)) (zero? (mod y x)))
      "Sao Multiplos"
      "Nao sao Multiplos"))

(defn main []
  (let [x (read)
        y (read)]
    (println (multiplos x y))))

(main)