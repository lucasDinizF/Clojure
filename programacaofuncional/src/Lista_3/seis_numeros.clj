(ns Lista-3.seis-numeros)


(defn impares [x y]
  (if (even? x) (range (+ x 1) y 2) (range x y 2)))

(defn main []
  (let [x (read)]
    (doall (map println  (impares x (+ x 12))))))

(main)