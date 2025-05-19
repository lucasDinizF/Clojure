(ns Lista-4.resto1)

(defn resto [x]
  (filter (fn [x] (or (= (mod x 5) 2)
                       (= (mod x 5) 3))) x))

(defn main []
  (let [x (read)
        y (read)]
    (doall (map println (resto (range (inc (min x y)) (max x y)))))))

(main)
