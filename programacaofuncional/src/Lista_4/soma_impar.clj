(ns Lista-4.soma-impar)

(defn soma_impares[x, y]
  (let [lista (if (even? (min x y)) (range (min x y) (max x y))
                                   (range (+ (min x y) 1) (max x y)))]
    (reduce + (filter odd? lista))))

(defn main []
  (let [x (read)
        y (read)]
    (println (soma_impares x y))))

(main)