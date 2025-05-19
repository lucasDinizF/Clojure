(ns Lista-3.tempo)

(defn tempo [n]
  (let [x (read)
        total (- 2015 x)]
    (cond (> total 0) (println total "D.C.")
          (<= total 0) (println (+ (* total -1) 1) "A.C."))))

(defn main []
  (let [n (read)]
    (doall (map tempo (range 0 n)))))

(main)