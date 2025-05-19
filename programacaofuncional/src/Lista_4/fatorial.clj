(ns Lista-4.fatorial)

(defn fatorial [y]
   (reduce * y))

(defn main []
  (let [n (read)]
    (println (fatorial (range 1 (+ n 1))))))

(main)