(ns Lista-4.intervalo)

(defn in [x]
  (count (filter (fn [x] (and (<= x 20) (>= x 10))) x)))

(defn out [y]
  (count (filter (fn [y] (or (< y 10) (> y 20))) y)))

(defn main []
  (let [n (read)
        rep (repeatedly n read)]
    (println (in rep) "in")
    (println (out rep) "out")
    ))

(main)