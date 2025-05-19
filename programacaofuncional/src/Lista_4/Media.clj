(ns Lista-4.Media)

(defn media [[x y z]]
  (format "%.1f" (/ (+ (* 2.0  x) (* 3.0 y) (* 5.0 z)) 10.0)))

(defn main []
  (let [n (read)
        lista (repeatedly n #(repeatedly 3 read))]
    (doall (map (fn [x] (println (media x))) lista))))

(main)