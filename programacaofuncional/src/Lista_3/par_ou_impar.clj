(ns Lista-3.par-ou-impar)

(defn par_impar [n]
  (let [x (read)]
    (cond (and (even? x) (> x 0)) (println "EVEN POSITIVE")
          (and (even? x) (< x 0)) (println "EVEN NEGATIVE")
          (and (odd? x) (> x 0)) (println "ODD POSITIVE")
          (and (odd? x) (< x 0)) (println "ODD NEGATIVE")
          :else (println "NULL")
          )))

(defn main []
  (let [n (read)]
    (doall (map par_impar (range 0 n)))))

(main)