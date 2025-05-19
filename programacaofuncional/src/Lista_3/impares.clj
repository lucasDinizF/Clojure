(ns Lista-3.impares)

(defn impares [x y]
  (range x y 2))

(defn main []
  (let [x (read)]
    (doall (map println (impares 1 (+ x 1))))))

(main)