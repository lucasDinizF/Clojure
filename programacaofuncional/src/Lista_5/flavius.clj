(ns Lista-5.flavius)

(defn flavius[x y [z n]]
  (if (> y z) (inc x)
              (recur (mod (+ x n) y) (inc y) [z n])))

(defn main []
  (let[n (read)
       lista (doall (repeatedly n #(doall (repeatedly 2 read))))
       casos (map (partial flavius 0 2) lista)]

    (doall (map println (map (fn [x y] (str "Case " x ": " y)) (range 1 (inc n)) casos)))))

(main)

