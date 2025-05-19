(ns Lista-4.positivos)

(defn positivos [x]
        (count (filter pos? x)))

(defn main []
  (println (positivos (repeatedly 6 read)) "valores positivos"))

(main)